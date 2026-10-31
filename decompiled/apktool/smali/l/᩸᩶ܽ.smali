.class public final Ll/᩸᩶ܽ;
.super Ll/۬ۗܿ;
.source "14V2"


# instance fields
.field public final synthetic ֫֫:Ll/᩶֫ᩳ;

.field public final synthetic ۟:Ll/᩶᩶ܽ;

.field public final synthetic ۧ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩶᩶ܽ;Ll/ۗܺ᩷;Ljava/lang/String;Ll/᩶֫ᩳ;)V
    .locals 0

    .line 139
    iput-object p1, p0, Ll/᩸᩶ܽ;->۟:Ll/᩶᩶ܽ;

    iput-object p3, p0, Ll/᩸᩶ܽ;->ۧ֫:Ljava/lang/String;

    iput-object p4, p0, Ll/᩸᩶ܽ;->֫֫:Ll/᩶֫ᩳ;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 3

    .line 142
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 143
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/᩸᩶ܽ;->ۧ֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 146
    :cond_0
    iget-object v1, p0, Ll/᩸᩶ܽ;->֫֫:Ll/᩶֫ᩳ;

    invoke-virtual {v1}, Ll/᩶֫ᩳ;->ۧ()Ll/ܶ᩵ܿ;

    move-result-object v1

    const-string v2, ".mtd"

    .line 147
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ܿ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    .line 148
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v2

    if-eqz v2, :cond_1

    const v0, 0x7f1202a8

    .line 149
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 151
    :cond_1
    invoke-virtual {v1, v0}, Ll/ܶ᩵ܿ;->ۧ(Ll/ܶ᩵ܿ;)Z

    .line 152
    iget-object v0, p0, Ll/᩸᩶ܽ;->۟:Ll/᩶᩶ܽ;

    invoke-static {v0}, Ll/᩶᩶ܽ;->ۧ(Ll/᩶᩶ܽ;)V

    .line 153
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 144
    :cond_2
    :goto_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
