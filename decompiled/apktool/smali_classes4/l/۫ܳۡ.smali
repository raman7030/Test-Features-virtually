.class public final Ll/۫ܳۡ;
.super Ljava/lang/Object;
.source "H1KB"

# interfaces
.implements Ll/֫᩻ۡ;


# instance fields
.field public final synthetic ֫:Ll/ܰܳۡ;

.field public final synthetic ۧ:Ll/᩺ܳۡ;

.field public final synthetic ܽ:Ljava/util/LinkedList;


# direct methods
.method public constructor <init>(Ll/ܰܳۡ;Ll/᩺ܳۡ;Ljava/util/LinkedList;)V
    .locals 0

    .line 679
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ܳۡ;->֫:Ll/ܰܳۡ;

    iput-object p2, p0, Ll/۫ܳۡ;->ۧ:Ll/᩺ܳۡ;

    iput-object p3, p0, Ll/۫ܳۡ;->ܽ:Ljava/util/LinkedList;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/۟ܳۡ;)V
    .locals 3

    .line 682
    invoke-virtual {p1}, Ll/۟ܳۡ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 683
    iget-object v0, p0, Ll/۫ܳۡ;->֫:Ll/ܰܳۡ;

    invoke-virtual {v0, p1}, Ll/ܰܳۡ;->ۧ(Ll/۟ܳۡ;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 686
    :cond_0
    iget-object v0, p1, Ll/۟ܳۡ;->ܿ:Ljava/lang/String;

    invoke-virtual {p1}, Ll/۟ܳۡ;->ۜ()Z

    move-result v1

    iget-object v2, p0, Ll/۫ܳۡ;->ۧ:Ll/᩺ܳۡ;

    invoke-interface {v2, v0, v1}, Ll/᩺ܳۡ;->֫(Ljava/lang/String;Z)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 688
    invoke-virtual {p1}, Ll/۟ܳۡ;->ۜ()Z

    move-result v0

    if-nez v0, :cond_2

    .line 689
    invoke-virtual {p1}, Ll/۟ܳۡ;->ۧ()V

    return-void

    :cond_1
    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 691
    invoke-virtual {p1}, Ll/۟ܳۡ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 692
    invoke-virtual {p1}, Ll/۟ܳۡ;->֫()V

    :cond_2
    :goto_0
    return-void

    .line 695
    :cond_3
    iget-object v0, p0, Ll/۫ܳۡ;->ܽ:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->addFirst(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
