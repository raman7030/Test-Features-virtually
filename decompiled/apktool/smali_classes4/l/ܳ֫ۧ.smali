.class public final Ll/ܳ֫ۧ;
.super Ljava/lang/Object;
.source "F7MF"

# interfaces
.implements Ll/ܺܳۧ;


# instance fields
.field public final ֫:Ll/ܺܳۧ;

.field public final ۧ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/ܺܳۧ;Ljava/util/List;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Ll/ܳ֫ۧ;->֫:Ll/ܺܳۧ;

    .line 44
    iput-object p2, p0, Ll/ܳ֫ۧ;->ۧ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/net/Uri;Ll/᩶۠֫;)Ljava/lang/Object;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ܳ֫ۧ;->֫:Ll/ܺܳۧ;

    invoke-interface {v0, p1, p2}, Ll/ܺܳۧ;->֫(Landroid/net/Uri;Ll/᩶۠֫;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤ᩺֫;

    .line 50
    iget-object p2, p0, Ll/ܳ֫ۧ;->ۧ:Ljava/util/List;

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Ll/ۤ᩺֫;->֫(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤ᩺֫;

    :cond_1
    :goto_0
    return-object p1
.end method
