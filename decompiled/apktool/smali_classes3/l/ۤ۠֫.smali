.class public final Ll/ۤ۠֫;
.super Ljava/lang/Object;
.source "C8NR"

# interfaces
.implements Ll/ܶ۠֫;


# instance fields
.field public ۙ:Ll/ܰܶۜ;

.field public ᩶:I

.field public ᩸:I

.field public final ᩹:Ll/ۜܶ֫;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    new-instance v0, Ll/ۜܶ֫;

    invoke-direct {v0}, Ll/ۜܶ֫;-><init>()V

    iput-object v0, p0, Ll/ۤ۠֫;->᩹:Ll/ۜܶ֫;

    const/16 v0, 0x1f40

    .line 92
    iput v0, p0, Ll/ۤ۠֫;->᩸:I

    .line 93
    iput v0, p0, Ll/ۤ۠֫;->᩶:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/۟۠֫;
    .locals 5

    .line 238
    new-instance v0, Ll/۟۠֫;

    iget-object v1, p0, Ll/ۤ۠֫;->᩹:Ll/ۜܶ֫;

    iget-object v2, p0, Ll/ۤ۠֫;->ۙ:Ll/ܰܶۜ;

    iget v3, p0, Ll/ۤ۠֫;->᩸:I

    iget v4, p0, Ll/ۤ۠֫;->᩶:I

    invoke-direct {v0, v3, v4, v1, v2}, Ll/۟۠֫;-><init>(IILl/ۜܶ֫;Ll/ܰܶۜ;)V

    return-object v0
.end method

.method public final bridge synthetic ֫()Ll/᩸۠֫;
    .locals 1

    .line 75
    invoke-virtual {p0}, Ll/ۤ۠֫;->֫()Ll/۟۠֫;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/util/Map;)V
    .locals 1

    .line 100
    iget-object v0, p0, Ll/ۤ۠֫;->᩹:Ll/ۜܶ֫;

    invoke-virtual {v0, p1}, Ll/ۜܶ֫;->֫(Ljava/util/Map;)V

    return-void
.end method

.method public final ֫(Ll/ܰܶۜ;)V
    .locals 0

    .line 123
    iput-object p1, p0, Ll/ۤ۠֫;->ۙ:Ll/ܰܶۜ;

    return-void
.end method
