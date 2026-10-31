.class public final Ll/ۡۗܿ;
.super Ljava/lang/Object;
.source "192I"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᩸:Ll/ۘۗܿ;


# direct methods
.method public constructor <init>(Ll/ۘۗܿ;)V
    .locals 0

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡۗܿ;->᩸:Ll/ۘۗܿ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 5

    .line 110
    iget-object p1, p0, Ll/ۡۗܿ;->᩸:Ll/ۘۗܿ;

    invoke-static {p1}, Ll/ۘۗܿ;->ᩳ(Ll/ۘۗܿ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_0

    .line 114
    :cond_0
    :try_start_0
    invoke-static {p1}, Ll/ۘۗܿ;->ܿ(Ll/ۘۗܿ;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    .line 115
    invoke-static {p1}, Ll/ۘۗܿ;->ۜ(Ll/ۘۗܿ;)Landroid/widget/EditText;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    .line 116
    invoke-static {p1}, Ll/ۘۗܿ;->᩻(Ll/ۘۗܿ;)Landroid/widget/EditText;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    .line 117
    invoke-static {p1}, Ll/ۘۗܿ;->ܳ(Ll/ۘۗܿ;)Landroid/widget/EditText;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    if-ltz v0, :cond_2

    const/16 v4, 0x64

    if-gt v0, v4, :cond_2

    if-ltz v1, :cond_2

    const/16 v4, 0xff

    if-gt v1, v4, :cond_2

    if-ltz v2, :cond_2

    if-gt v2, v4, :cond_2

    if-ltz v3, :cond_2

    if-le v3, v4, :cond_1

    goto :goto_0

    :cond_1
    mul-int/lit16 v0, v0, 0xff

    int-to-float v0, v0

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v0, v4

    .line 121
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    .line 122
    invoke-static {p1}, Ll/ۘۗܿ;->ۧ(Ll/ۘۗܿ;)Ll/ۤ᩷ۡ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۤ᩷ۡ;->֫(I)V

    .line 123
    invoke-static {p1, v0}, Ll/ۘۗܿ;->ۧ(Ll/ۘۗܿ;I)V

    .line 124
    invoke-static {p1}, Ll/ۘۗܿ;->֫(Ll/ۘۗܿ;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 125
    invoke-static {p1}, Ll/ۘۗܿ;->ܽ(Ll/ۘۗܿ;)Ll/֡ۚۢ;

    move-result-object v0

    invoke-static {p1}, Ll/ۘۗܿ;->᩷(Ll/ۘۗܿ;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Ll/֡ۚۢ;->֫(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_0
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method
