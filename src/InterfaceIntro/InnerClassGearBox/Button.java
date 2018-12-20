package InterfaceIntro.InnerClassGearBox;

public class Button {

    private String title;
    private OnClickListener onClicker;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClicker = onClickListener;
    }

    public void onClick(){
        this.onClicker.onClick(this.title);
    }

    public interface OnClickListener {
        public void onClick(String title);

    }


}
