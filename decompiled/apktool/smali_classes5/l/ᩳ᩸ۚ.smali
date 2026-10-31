.class public abstract Ll/ᩳ᩸ۚ;
.super Ll/᩷᩹ۚ;
.source "4BJX"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .line 312
    invoke-direct {p0}, Ll/᩷᩹ۚ;-><init>()V

    .line 313
    invoke-static {p1}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 314
    invoke-static {p2}, Ll/ܿ֡ۚ;->֫(Ljava/lang/String;)V

    .line 316
    invoke-static {p1}, Ll/᩻֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ᩳ᩸ۚ;->֫:Ljava/lang/String;

    const-string p1, "\'"

    .line 317
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p2, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const-string p1, "\""

    .line 318
    invoke-virtual {p2, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p2, p1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    .line 0
    invoke-static {v1, v1, p2}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_3
    if-eqz p3, :cond_4

    .line 323
    invoke-static {p2}, Ll/᩻֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_4
    if-eqz p1, :cond_5

    .line 22
    invoke-static {p2}, Ll/᩻֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_5
    invoke-static {p2}, Ll/᩻֡ۚ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 323
    :goto_1
    iput-object p1, p0, Ll/ᩳ᩸ۚ;->ۧ:Ljava/lang/String;

    return-void
.end method
