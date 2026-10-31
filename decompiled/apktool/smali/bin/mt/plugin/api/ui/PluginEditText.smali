.class public interface abstract Lbin/mt/plugin/api/ui/PluginEditText;
.super Ljava/lang/Object;
.source "PluginEditText.java"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginView;


# static fields
.field public static final SOFT_WRAP_COMPLETELY_FILLED:I = 0x2

.field public static final SOFT_WRAP_DISABLE:I = 0x0

.field public static final SOFT_WRAP_KEEP_WORD:I = 0x1

.field public static final SYNTAX_REGEX:Ljava/lang/String; = "INTERNAL:Regex"

.field public static final SYNTAX_REGEX_REPLACEMENT:Ljava/lang/String; = "INTERNAL:RegexReplacement"


# virtual methods
.method public abstract addTextChangedListener(Lbin/mt/plugin/api/ui/PluginEditTextWatcher;)V
.end method

.method public abstract getBackground()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract getHint()Ljava/lang/CharSequence;
.end method

.method public abstract getInputType()I
.end method

.method public abstract getMaxLines()I
.end method

.method public abstract getMinLines()I
.end method

.method public abstract getSelectionEnd()I
.end method

.method public abstract getSelectionStart()I
.end method

.method public abstract getText()Landroid/text/Editable;
.end method

.method public abstract getTextColor()I
.end method

.method public abstract getTextSize()F
.end method

.method public abstract getTypeface()Landroid/graphics/Typeface;
.end method

.method public abstract isBoxStyle()Z
.end method

.method public abstract isLineStyle()Z
.end method

.method public abstract isReadOnly()Z
.end method

.method public abstract isSingleLine()Z
.end method

.method public abstract length()I
.end method

.method public abstract requestFocusAndShowIME()Z
.end method

.method public abstract selectAll()V
.end method

.method public abstract selectEnd()V
.end method

.method public abstract setBackground(Landroid/graphics/drawable/Drawable;)V
.end method

.method public abstract setBackgroundColor(I)V
.end method

.method public abstract setBracketHighlightEnable(Z)V
.end method

.method public abstract setHint(Ljava/lang/CharSequence;)V
.end method

.method public abstract setHintTextColor(I)V
.end method

.method public abstract setHintTextColor(Ljava/lang/Integer;)V
.end method

.method public abstract setInputMultiline()V
.end method

.method public abstract setInputNumber()V
.end method

.method public abstract setInputType(I)V
.end method

.method public abstract setLines(I)V
.end method

.method public abstract setMaxLength(I)V
.end method

.method public abstract setMaxLines(I)V
.end method

.method public abstract setMinLines(I)V
.end method

.method public abstract setOnClickListener(Lbin/mt/plugin/api/ui/PluginView$OnClickListener;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract setOnLongClickListener(Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract setReadOnly(Z)V
.end method

.method public abstract setSelection(I)V
.end method

.method public abstract setSelection(II)V
.end method

.method public abstract setSingleLine(Z)V
.end method

.method public abstract setSoftWrap(I)V
.end method

.method public abstract setSyntaxHighlight(Ljava/lang/String;)V
.end method

.method public abstract setText(Ljava/lang/CharSequence;)V
.end method

.method public abstract setTextColor(I)V
.end method

.method public abstract setTextColor(Ljava/lang/Integer;)V
.end method

.method public abstract setTextSize(F)V
.end method

.method public abstract setTypeface(Landroid/graphics/Typeface;)V
.end method

.method public abstract setTypeface(Landroid/graphics/Typeface;I)V
.end method
