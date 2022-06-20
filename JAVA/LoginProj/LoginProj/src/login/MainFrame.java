package login;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class MainFrame extends WindowAdapter {
	TextField tfId, tfPwd, tfMsg;
	ArrayList<MemberVo> list;

	public void startFrame() {
		MemberDAO dao = new MemberDAO();
		Frame f = new Frame("Login");
		f.setSize(500, 250);
		f.setLayout(null);

		Button bLogin = new Button("Login");
		bLogin.setSize(100, 50);
		bLogin.setLocation(300, 100);
		bLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tfMsg.setText("");
				if (tfId.getText().equals("")) {
					tfMsg.setText("ID를 입력하세요.");
				} else if (tfPwd.getText().equals("")) {
					tfMsg.setText("Password를 입력하세요.");
				}

				list = dao.list(tfId.getText());
				for (int i = 0; i < list.size(); i++) {
					MemberVo data = (MemberVo) list.get(i);
					String id = data.getId();
					String password = data.getPassword();
					System.out.println(id + " : " + password);
					if (id.equals(tfId.getText())
							&& password.equals(tfPwd.getText())) {
						tfMsg.setText("로그인 성공");
					} else {
						tfMsg.setText("로그인 실패");
					}
				}
			}
		});
		
		Button bReg = new Button("Reg");
		bReg.setSize(100, 50);
		bReg.setLocation(300, 150);
		bReg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean b = false;
				tfMsg.setText("");
				if (tfId.getText().equals("")) {
					tfMsg.setText("ID를 입력하세요.");
				} else if (tfPwd.getText().equals("")) {
					tfMsg.setText("Password를 입력하세요.");
				} else {
					b = true;
				}
				if (b && dao.insert(tfId.getText(), tfPwd.getText())) {
					tfMsg.setText("Insert가 성공하였습니다.");
				} else {
					tfMsg.setText("Insert가 실패하였습니다.");
				}
			}
		});

		tfId = new TextField();
		tfPwd = new TextField();
		tfMsg = new TextField();

		tfId.setSize(150, 30);
		tfId.setLocation(50, 50);

		tfPwd.setEchoChar('*');
		tfPwd.setSize(150, 30);
		tfPwd.setLocation(50, 110);

		tfMsg.setEditable(false);
		tfMsg.setSize(200, 30);
		tfMsg.setLocation(50, 170);

		f.addWindowListener(this);
		f.add(tfId);
		f.add(tfPwd);
		f.add(tfMsg);
		f.add(bLogin);
		f.add(bReg);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		MainFrame mf = new MainFrame();
		mf.startFrame();
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
