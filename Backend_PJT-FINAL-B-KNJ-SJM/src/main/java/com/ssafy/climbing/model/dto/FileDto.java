package com.ssafy.climbing.model.dto;


public class FileDto {

	private static int fileId_auto = 1;
	private int fileId = 1;
	private String originFile;
	private String saveFolder;
	private String saveFile;
	private int articleId;
	
	public FileDto() {}
	
	
	
	public FileDto(String originFile, String saveFolder, String saveFile, int articleId) {
		this.fileId = fileId_auto++;
		this.originFile = originFile;
		this.saveFolder = saveFolder;
		this.saveFile = saveFile;
		this.articleId = articleId;
	}



	public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	public String getOriginFile() {
		return originFile;
	}
	public void setOriginFile(String originFile) {
		this.originFile = originFile;
	}
	public String getSaveFolder() {
		return saveFolder;
	}
	public void setSaveFolder(String saveFolder) {
		this.saveFolder = saveFolder;
	}
	public String getSaveFile() {
		return saveFile;
	}
	public void setSaveFile(String saveFile) {
		this.saveFile = saveFile;
	}
	public int getArticleId() {
		return articleId;
	}
	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}
	
	@Override
	public String toString() {
		return "FileDto [fileId=" + fileId + ", originFile=" + originFile + ", saveFolder=" + saveFolder + ", saveFile="
				+ saveFile + ", articleId=" + articleId + "]";
	}
}
