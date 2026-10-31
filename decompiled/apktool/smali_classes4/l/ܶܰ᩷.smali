.class public final Ll/ܶܰ᩷;
.super Ljava/lang/Object;
.source "I1KV"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public ᩸:Ll/۬ۗܿ;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/۬ۗܿ;)V
    .locals 0

    .line 1034
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1035
    iput-object p1, p0, Ll/ܶܰ᩷;->᩹:Ljava/lang/String;

    .line 1036
    iput-object p2, p0, Ll/ܶܰ᩷;->᩸:Ll/۬ۗܿ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 4

    .line 1051
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iget-object v1, p0, Ll/ܶܰ᩷;->᩹:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    iget-object v3, p0, Ll/ܶܰ᩷;->᩸:Ll/۬ۗܿ;

    if-gt v0, v2, :cond_0

    .line 1052
    invoke-static {p1, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 1053
    invoke-virtual {v3, v1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 1054
    invoke-virtual {v3}, Ll/۬ۗܿ;->֡()V

    return-void

    .line 1056
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "-"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 1057
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 1058
    invoke-virtual {v3}, Ll/۬ۗܿ;->֡()V

    :cond_1
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
