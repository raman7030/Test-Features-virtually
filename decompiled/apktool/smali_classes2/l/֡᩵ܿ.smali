.class public final Ll/֡᩵ܿ;
.super Ljava/lang/Object;
.source "A186"

# interfaces
.implements Ll/ۜ᩵ܿ;


# instance fields
.field public final synthetic ֫:Ll/ܶ᩵ܿ;

.field public final synthetic ۧ:Ll/᩵᩶ܿ;

.field public final synthetic ܽ:Ljava/util/function/IntConsumer;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Ll/᩵᩶ܿ;Ljava/util/function/IntConsumer;)V
    .locals 0

    .line 603
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡᩵ܿ;->֫:Ll/ܶ᩵ܿ;

    iput-object p2, p0, Ll/֡᩵ܿ;->ۧ:Ll/᩵᩶ܿ;

    iput-object p3, p0, Ll/֡᩵ܿ;->ܽ:Ljava/util/function/IntConsumer;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܶ᩵ܿ;I)V
    .locals 3

    .line 606
    iget-object p2, p0, Ll/֡᩵ܿ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ll/ۙ᩸᩷;->ۚ()Z

    move-result v0

    iget-object v1, p0, Ll/֡᩵ܿ;->ܽ:Ljava/util/function/IntConsumer;

    iget-object v2, p0, Ll/֡᩵ܿ;->ۧ:Ll/᩵᩶ܿ;

    invoke-virtual {v2, p2, p1, v0, v1}, Ll/᩵᩶ܿ;->֫(Ljava/lang/String;Ljava/lang/String;ZLjava/util/function/IntConsumer;)V

    return-void
.end method

.method public final ֫(Ljava/io/IOException;)Z
    .locals 1

    .line 611
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "Unable to open target file"

    .line 612
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
