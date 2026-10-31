.class public final Ll/ᩳۡۡ;
.super Ll/ۗ۬ۡ;
.source "P9S5"


# instance fields
.field public final synthetic ᩸:Ll/᩻ۡۡ;


# direct methods
.method public constructor <init>(Ll/᩻ۡۡ;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 163
    iput-object p1, p0, Ll/ᩳۡۡ;->᩸:Ll/᩻ۡۡ;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 166
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    .line 167
    iget-object v0, p0, Ll/ᩳۡۡ;->᩸:Ll/᩻ۡۡ;

    invoke-static {v0}, Ll/᩻ۡۡ;->ᩳ(Ll/᩻ۡۡ;)V

    .line 168
    invoke-static {v0}, Ll/᩻ۡۡ;->ܽ(Ll/᩻ۡۡ;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ll/᩻ۡۡ;->ۧ(Ll/᩻ۡۡ;)Ll/ܿۡۡ;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 169
    invoke-static {v0}, Ll/᩻ۡۡ;->ۧ(Ll/᩻ۡۡ;)Ll/ܿۡۡ;

    move-result-object v0

    invoke-interface {v0, p1}, Ll/ܿۡۡ;->֫(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
