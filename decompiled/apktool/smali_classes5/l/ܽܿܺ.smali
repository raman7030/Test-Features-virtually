.class public final Ll/ܽܿܺ;
.super Ll/ۧܿܺ;
.source "2BCD"

# interfaces
.implements Ll/ۨᩳܺ;


# instance fields
.field public final ܿ:Ll/᩺ܺܺ;


# direct methods
.method public constructor <init>(Ll/۫ܺܺ;ILl/᩶ܺܺ;Ll/ܰᩳܺ;)V
    .locals 0

    .line 44
    invoke-direct {p0, p1, p2, p3, p4}, Ll/ۧܿܺ;-><init>(Ll/۫ܺܺ;ILl/᩶ܺܺ;Ll/ܰᩳܺ;)V

    .line 46
    invoke-virtual {p0}, Ll/ۧܿܺ;->᩻()Ll/۬ܺܺ;

    move-result-object p4

    invoke-virtual {p4}, Ll/۬ܺܺ;->getString()Ljava/lang/String;

    move-result-object p4

    .line 48
    invoke-virtual {p1}, Ll/۫ܺܺ;->ܺ()Ll/۟ܺܺ;

    move-result-object p1

    and-int/lit8 p2, p2, 0x8

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 50
    :goto_0
    invoke-virtual {p3}, Ll/᩶ܺܺ;->ۚ()Z

    move-result p3

    .line 205
    invoke-static {p4}, Ll/᩺ܺܺ;->ۧ(Ljava/lang/String;)Ll/᩺ܺܺ;

    move-result-object p4

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    if-eqz p3, :cond_2

    const p2, 0x7fffffff

    .line 212
    invoke-virtual {p1, p2}, Ll/۟ܺܺ;->֫(I)Ll/۟ܺܺ;

    move-result-object p1

    .line 215
    :cond_2
    invoke-virtual {p4, p1}, Ll/᩺ܺܺ;->֫(Ll/۟ܺܺ;)Ll/᩺ܺܺ;

    move-result-object p4

    .line 48
    :goto_1
    iput-object p4, p0, Ll/ܽܿܺ;->ܿ:Ll/᩺ܺܺ;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩺ܺܺ;
    .locals 1

    .line 58
    iget-object v0, p0, Ll/ܽܿܺ;->ܿ:Ll/᩺ܺܺ;

    return-object v0
.end method
