.class public final synthetic Ll/ܰ۬ۜ;
.super Ljava/lang/Object;
.source "D8GL"

# interfaces
.implements Ll/ᩳܰ֫;
.implements Ll/᩻ۗۜ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܰ۬ۜ;->᩸:Ljava/lang/Object;

    iput-object p2, p0, Ll/ܰ۬ۜ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۗ۠֫;)Ljava/lang/String;
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ܰ۬ۜ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۤۤۜ;

    iget-object v1, p0, Ll/ܰ۬ۜ;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/᩻۬ۜ;

    invoke-static {v0, v1, p1}, Ll/ۤۤۜ;->ܽ(Ll/ۤۤۜ;Ll/᩻۬ۜ;Ll/ۗ۠֫;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/ۙ᩺֫;)V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ܰ۬ۜ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ۗۙۜ;

    iget-object v1, p0, Ll/ܰ۬ۜ;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/ᩳܰ֫;

    invoke-static {v0, v1, p1}, Ll/ۗۙۜ;->֫(Ll/ۗۙۜ;Ll/ᩳܰ֫;Ll/ۙ᩺֫;)V

    return-void
.end method
