.class public final synthetic Ll/᩵᩹ۢ;
.super Ljava/lang/Object;
.source "Q1R8"

# interfaces
.implements Ll/᩺᩻᩻;
.implements Ll/᩵᩹᩷;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩵᩹ۢ;->᩸:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩵᩹ۢ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(J)Ljava/io/InputStream;
    .locals 3

    .line 2
    iget-object v0, p0, Ll/᩵᩹ۢ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۗۢ᩻;

    .line 6
    iget-object v1, p0, Ll/᩵᩹ۢ;->᩹:Ljava/lang/Object;

    .line 8
    check-cast v1, Ll/ᩳۜܳ;

    .line 74
    invoke-virtual {v0}, Ll/ۗۢ᩻;->ۙ()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 75
    invoke-interface {v1}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, p2, v1}, Ll/ۗۢ᩻;->֫(JLjava/lang/String;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1

    .line 77
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    throw p1
.end method

.method public ֫(Landroid/content/Intent;I)V
    .locals 0

    .line 0
    iget-object p1, p0, Ll/᩵᩹ۢ;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/ۤ᩹ۢ;

    iget-object p2, p0, Ll/᩵᩹ۢ;->᩹:Ljava/lang/Object;

    check-cast p2, Ll/ܶ᩵ܿ;

    invoke-static {p1, p2}, Ll/ۤ᩹ۢ;->֫(Ll/ۤ᩹ۢ;Ll/ܶ᩵ܿ;)V

    return-void
.end method
