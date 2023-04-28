package uz.davr.nci.dtos;


import uz.davr.nci.enums.Lang;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class SharedI18n implements Serializable {
    private @NotNull Lang lang;
    private @NotNull @Size(
            max = 64
    ) String text;

    public SharedI18n lang(Lang lang) {
        this.lang = lang;
        return this;
    }

    public SharedI18n(@NotNull Lang lang, @NotNull @Size(
            max = 64
    ) String text) {
        this.lang = lang;
        this.text = text;
    }

    public SharedI18n() {
    }

    public SharedI18n text(String text) {
        this.text = text;
        return this;
    }

    public SharedI18n withLang(Lang lang) {
        this.lang = lang;
        return this;
    }

    public SharedI18n withText(String text) {
        this.text = text;
        return this;
    }

    public Lang getLang() {
        return this.lang;
    }

    public String getText() {
        return this.text;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof SharedI18n)) {
            return false;
        } else {
            SharedI18n other = (SharedI18n)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$lang = this.getLang();
                Object other$lang = other.getLang();
                if (this$lang == null) {
                    if (other$lang != null) {
                        return false;
                    }
                } else if (!this$lang.equals(other$lang)) {
                    return false;
                }

                Object this$text = this.getText();
                Object other$text = other.getText();
                if (this$text == null) {
                    if (other$text != null) {
                        return false;
                    }
                } else if (!this$text.equals(other$text)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof SharedI18n;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $lang = this.getLang();
        result = result * 59 + ($lang == null ? 43 : $lang.hashCode());
        Object $text = this.getText();
        result = result * 59 + ($text == null ? 43 : $text.hashCode());
        return result;
    }

    public String toString() {
        Lang var10000 = this.getLang();
        return "SharedI18n(lang=" + var10000 + ", text=" + this.getText() + ")";
    }
}
