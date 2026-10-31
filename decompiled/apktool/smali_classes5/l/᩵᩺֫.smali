.class public final Ll/᩵᩺֫;
.super Ljava/lang/Object;
.source "H7MI"

# interfaces
.implements Ll/ܰ᩺֫;


# instance fields
.field public final ֫:Ll/ܰ᩺֫;

.field public final ۧ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ll/ۡ᩺֫;Ljava/util/List;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Ll/᩵᩺֫;->֫:Ll/ܰ᩺֫;

    .line 43
    iput-object p2, p0, Ll/᩵᩺֫;->ۧ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܺܳۧ;
    .locals 3

    .line 48
    new-instance v0, Ll/ܳ֫ۧ;

    iget-object v1, p0, Ll/᩵᩺֫;->֫:Ll/ܰ᩺֫;

    .line 49
    invoke-interface {v1}, Ll/ܰ᩺֫;->֫()Ll/ܺܳۧ;

    move-result-object v1

    iget-object v2, p0, Ll/᩵᩺֫;->ۧ:Ljava/util/List;

    invoke-direct {v0, v1, v2}, Ll/ܳ֫ۧ;-><init>(Ll/ܺܳۧ;Ljava/util/List;)V

    return-object v0
.end method

.method public final ֫(Ll/۫᩺֫;Ll/ۙ᩺֫;)Ll/ܺܳۧ;
    .locals 2

    .line 56
    new-instance v0, Ll/ܳ֫ۧ;

    iget-object v1, p0, Ll/᩵᩺֫;->֫:Ll/ܰ᩺֫;

    .line 57
    invoke-interface {v1, p1, p2}, Ll/ܰ᩺֫;->֫(Ll/۫᩺֫;Ll/ۙ᩺֫;)Ll/ܺܳۧ;

    move-result-object p1

    iget-object p2, p0, Ll/᩵᩺֫;->ۧ:Ljava/util/List;

    invoke-direct {v0, p1, p2}, Ll/ܳ֫ۧ;-><init>(Ll/ܺܳۧ;Ljava/util/List;)V

    return-object v0
.end method
