package org.bts.android.dummyadaptader.data;


/**
 * Created by pedrodelmonte on 13/03/17.
 */

public class Item {

    private String mImagePath;
    private String mTitle;
    private String mBody;

    public Item(String mImagePath, String mTitle, String mBody) {
        this.mImagePath = mImagePath;
        this.mTitle = mTitle;
        this.mBody = mBody;
    }

    public String getImagePath() {
        return mImagePath;
    }

    public void setImagePath(String ImagePath) {
        this.mImagePath = ImagePath;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String Title) {
        this.mTitle = Title;
    }

    public String getBody() {
        return mBody;
    }

    public void setBody(String Body) {
        this.mBody = Body;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append("mImagePath='").append(mImagePath).append('\'');
        sb.append(", mTitle='").append(mTitle).append('\'');
        sb.append(", mBody='").append(mBody).append('\'');
        sb.append('}');

        return sb.toString();
    }
}
