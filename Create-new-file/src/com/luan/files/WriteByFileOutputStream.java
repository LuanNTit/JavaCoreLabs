/*
 * Tên file: WriteByFileOutputStream.java
 * Tác giả: Luan NT
 * Ngày tạo: Feb 22, 2024
 */
package com.luan.files;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByFileOutputStream {
	public static void main(String[] args) {
		String fileData = "Pankaj Kumar";
        String filePath = "name.txt";

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(fileData.getBytes());
            System.out.println("Data written to " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
