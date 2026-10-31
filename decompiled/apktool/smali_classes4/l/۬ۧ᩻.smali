.class public final Ll/۬ۧ᩻;
.super Ll/ۜ᩶ܳ;
.source "22BV"


# instance fields
.field public final synthetic ܿ:Ll/ܽܽ᩻;


# direct methods
.method public constructor <init>(Ll/ܽܽ᩻;Ll/᩶ۙܳ;)V
    .locals 0

    .line 843
    iput-object p1, p0, Ll/۬ۧ᩻;->ܿ:Ll/ܽܽ᩻;

    invoke-direct {p0, p2}, Ll/ۜ᩶ܳ;-><init>(Ll/᩶ۙܳ;)V

    return-void
.end method


# virtual methods
.method public final ܳ()Z
    .locals 1

    .line 846
    invoke-super {p0}, Ll/ۜ᩶ܳ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۬ۧ᩻;->ܿ:Ll/ܽܽ᩻;

    invoke-virtual {v0}, Ll/ܽܽ᩻;->۬()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
