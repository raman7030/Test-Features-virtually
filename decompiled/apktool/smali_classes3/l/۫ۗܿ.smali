.class public final Ll/۫ۗܿ;
.super Ljava/lang/Object;
.source "X81I"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic ᩸:Ll/ۛۗܿ;


# direct methods
.method public constructor <init>(Ll/ۛۗܿ;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۗܿ;->᩸:Ll/ۛۗܿ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 3

    .line 53
    iget-object v0, p0, Ll/۫ۗܿ;->᩸:Ll/ۛۗܿ;

    invoke-static {v0}, Ll/ۛۗܿ;->ܽ(Ll/ۛۗܿ;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ll/ۛۗܿ;->ܳ(Ll/ۛۗܿ;)Ll/ۤۤᩳ;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->isFocused()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 55
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    .line 56
    invoke-static {v0}, Ll/ۛۗܿ;->ۧ(Ll/ۛۗܿ;)Ll/ۤۤᩳ;

    move-result-object v1

    invoke-static {v0}, Ll/ۛۗܿ;->ᩳ(Ll/ۛۗܿ;)I

    move-result v2

    mul-int p1, p1, v2

    invoke-static {v0}, Ll/ۛۗܿ;->ܿ(Ll/ۛۗܿ;)I

    move-result v0

    div-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
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
