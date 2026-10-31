.class public final Ll/۟֨۠;
.super Ll/ᩴ۠۠;
.source "G3L1"


# instance fields
.field public ֫:Ll/ۨ֨۠;

.field public final synthetic ۧ:Ll/ܽ۠۠;


# direct methods
.method public constructor <init>(Ll/ܽ۠۠;Ll/ۨ֨۠;)V
    .locals 0

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 398
    iput-object p1, p0, Ll/۟֨۠;->ۧ:Ll/ܽ۠۠;

    .line 399
    iput-object p2, p0, Ll/۟֨۠;->֫:Ll/ۨ֨۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۡ۠۠;Ll/ۢ۠۠;Ll/ۢ۠۠;Ljava/lang/Object;)V
    .locals 1

    .line 394
    check-cast p2, Ll/֫۠۠;

    check-cast p3, Ll/֫۠۠;

    check-cast p4, Ljava/lang/Void;

    .line 413
    instance-of p4, p3, Ll/᩺֨۠;

    if-eqz p4, :cond_0

    move-object p4, p3

    check-cast p4, Ll/᩺֨۠;

    .line 414
    iget-object p4, p4, Ll/᩺֨۠;->᩶:Ll/ۨ֨۠;

    iget-object v0, p0, Ll/۟֨۠;->֫:Ll/ۨ֨۠;

    if-eq p4, v0, :cond_0

    .line 415
    iget-object p2, p2, Ll/֫۠۠;->᩹:Ljava/util/EnumMap;

    invoke-virtual {p2, p1}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, p3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۢ۠۠;Ljava/lang/Object;)V
    .locals 1

    .line 394
    check-cast p1, Ll/֫۠۠;

    check-cast p2, Ljava/lang/Void;

    .line 404
    instance-of p2, p1, Ll/᩺֨۠;

    if-eqz p2, :cond_0

    move-object p2, p1

    check-cast p2, Ll/᩺֨۠;

    .line 405
    iget-object p2, p2, Ll/᩺֨۠;->᩶:Ll/ۨ֨۠;

    iget-object v0, p0, Ll/۟֨۠;->֫:Ll/ۨ֨۠;

    if-eq p2, v0, :cond_0

    .line 406
    iget-object p2, p0, Ll/۟֨۠;->ۧ:Ll/ܽ۠۠;

    iget-object p2, p2, Ll/ܽ۠۠;->ۙ:Ljava/util/LinkedHashMap;

    iget-object p1, p1, Ll/ۢ۠۠;->᩸:Ljava/lang/Object;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
