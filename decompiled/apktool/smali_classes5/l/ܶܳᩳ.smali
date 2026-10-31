.class public final Ll/ܶܳᩳ;
.super Ll/᩸ܳᩳ;
.source "4B3Z"

# interfaces
.implements Lnet/sf/sevenzipjbinding/ICryptoGetTextPassword;


# instance fields
.field public final synthetic ۬:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۙܳᩳ;Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p2, p0, Ll/ܶܳᩳ;->۬:Ljava/lang/String;

    .line 77
    invoke-direct {p0, p1}, Ll/᩸ܳᩳ;-><init>(Ll/ۙܳᩳ;)V

    return-void
.end method


# virtual methods
.method public final cryptoGetTextPassword()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Ll/ܶܳᩳ;->۬:Ljava/lang/String;

    return-object v0
.end method

.method public final getItemInformation(ILnet/sf/sevenzipjbinding/impl/OutItemFactory;)Lnet/sf/sevenzipjbinding/IOutItemBase;
    .locals 2

    .line 96
    iget-object v0, p0, Ll/᩸ܳᩳ;->᩸:Ll/ۙܳᩳ;

    invoke-interface {v0}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1

    if-nez v1, :cond_0

    .line 99
    invoke-interface {v0, p1, p2}, Ll/ۙܳᩳ;->getItemInformation(ILnet/sf/sevenzipjbinding/impl/OutItemFactory;)Lnet/sf/sevenzipjbinding/impl/OutItem;

    move-result-object p1

    return-object p1

    .line 97
    :cond_0
    new-instance p1, Lnet/sf/sevenzipjbinding/SevenZipException;

    const-string p2, "Canceled"

    invoke-direct {p1, p2}, Lnet/sf/sevenzipjbinding/SevenZipException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
