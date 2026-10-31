.class public final synthetic Ll/᩶ܳᩳ;
.super Ljava/lang/Object;
.source "4B3Z"


# direct methods
.method public static ֫(Ll/ۙܳᩳ;ILnet/sf/sevenzipjbinding/impl/OutItemFactory;)Lnet/sf/sevenzipjbinding/impl/OutItem;
    .locals 3

    .line 157
    invoke-virtual {p2}, Lnet/sf/sevenzipjbinding/impl/OutItemFactory;->createOutItem()Lnet/sf/sevenzipjbinding/IOutItemBase;

    move-result-object p2

    check-cast p2, Lnet/sf/sevenzipjbinding/impl/OutItem;

    .line 158
    invoke-interface {p0, p1}, Ll/ۙܳᩳ;->ᩳ(I)Ll/ۗܳᩳ;

    move-result-object p0

    .line 212
    iget-object p1, p0, Ll/ۗܳᩳ;->ܽ:Ljava/lang/String;

    const-string v0, "/"

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setPropertyIsDir(Ljava/lang/Boolean;)V

    goto :goto_0

    .line 215
    :cond_0
    iget-wide v0, p0, Ll/ۗܳᩳ;->֫:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2, v0}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setDataSize(Ljava/lang/Long;)V

    .line 217
    :goto_0
    new-instance v0, Ljava/util/Date;

    iget-wide v1, p0, Ll/ۗܳᩳ;->ᩳ:J

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p2, v0}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setPropertyLastModificationTime(Ljava/util/Date;)V

    .line 218
    invoke-virtual {p2, p1}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setPropertyPath(Ljava/lang/String;)V

    .line 219
    iget-object p0, p0, Ll/ۗܳᩳ;->ۧ:Ljava/lang/String;

    if-eqz p0, :cond_1

    .line 220
    invoke-virtual {p2, p0}, Lnet/sf/sevenzipjbinding/impl/OutItem;->setPropertySymLink(Ljava/lang/String;)V

    :cond_1
    return-object p2
.end method
