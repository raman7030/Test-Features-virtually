.class public final Ll/ۗۙܽ;
.super Ll/۟ܶۡ;
.source "C627"


# instance fields
.field public final synthetic ۜ:Ll/ۗܺ᩷;

.field public final synthetic ۡ:Ljava/lang/String;

.field public final synthetic ۢ:Z

.field public final ܳ:Ll/ۡ᩹ۡ;

.field public final synthetic ᩷:Ljava/lang/String;

.field public final synthetic ᩻:Ll/۬ۙܽ;


# direct methods
.method public constructor <init>(Ll/۬ۙܽ;Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 135
    iput-object p1, p0, Ll/ۗۙܽ;->᩻:Ll/۬ۙܽ;

    iput-object p2, p0, Ll/ۗۙܽ;->ۜ:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/ۗۙܽ;->ۡ:Ljava/lang/String;

    iput-object p4, p0, Ll/ۗۙܽ;->᩷:Ljava/lang/String;

    iput-boolean p5, p0, Ll/ۗۙܽ;->ۢ:Z

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    .line 136
    invoke-static {p2}, Ll/ۡ᩹ۡ;->֫(Ll/᩻ۡ֫;)Ll/ۡ᩹ۡ;

    move-result-object p1

    iput-object p1, p0, Ll/ۗۙܽ;->ܳ:Ll/ۡ᩹ۡ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 150
    iget-object v0, p0, Ll/ۗۙܽ;->ܳ:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 151
    :cond_0
    iget-object v0, p0, Ll/ۗۙܽ;->᩻:Ll/۬ۙܽ;

    invoke-virtual {v0}, Ll/۬ۙܽ;->֫()V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 156
    iget-object v0, p0, Ll/ۗۙܽ;->ܳ:Ll/ۡ᩹ۡ;

    invoke-virtual {v0}, Ll/ۡ᩹ۡ;->ۧ()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 157
    :cond_0
    iget-object v0, p0, Ll/ۗۙܽ;->ۜ:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 140
    iget-object v0, p0, Ll/ۗۙܽ;->ۜ:Ll/ۗܺ᩷;

    const v1, 0x7f12090c

    invoke-virtual {p0, v0, v1}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;I)V

    return-void
.end method

.method public final ܿ()V
    .locals 4

    .line 145
    iget-object v0, p0, Ll/ۗۙܽ;->᩷:Ljava/lang/String;

    iget-boolean v1, p0, Ll/ۗۙܽ;->ۢ:Z

    iget-object v2, p0, Ll/ۗۙܽ;->᩻:Ll/۬ۙܽ;

    iget-object v3, p0, Ll/ۗۙܽ;->ۡ:Ljava/lang/String;

    invoke-virtual {v2, v3, v0, v1}, Ll/۬ۙܽ;->֫(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 162
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
