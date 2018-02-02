package at.polycollege.fileupload;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.servlet.http.Part;

@ManagedBean(name="fileUpload")
@RequestScoped
public class FileUploadBean {
	private Part file;
	private String text;

	public Part getFile() {
		return file;
	}
	public void setFile(Part file) {
		this.file = file;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public void upload() throws IOException {
		if (file != null) {
			InputStream is = file.getInputStream();
			Scanner scanner = new Scanner(is);
			text = scanner.useDelimiter("\\A").next();
			scanner.close();
		}
	}
}
