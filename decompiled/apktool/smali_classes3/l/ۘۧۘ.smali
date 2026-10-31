.class public final Ll/ۘۧۘ;
.super Ljava/lang/Object;
.source "Z9HI"

# interfaces
.implements Ll/᩶ۧۘ;


# static fields
.field public static final ᩶:Ll/֫᩻֨;

.field public static final synthetic ᩹:I


# instance fields
.field public ᩸:Ll/ۖ֫ۘ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 36
    const-class v0, Ll/ۘۧۘ;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۘۧۘ;->᩶:Ll/֫᩻֨;

    return-void
.end method

.method public constructor <init>(Ll/ۖ֫ۘ;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Ll/ۘۧۘ;->᩸:Ll/ۖ֫ۘ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۘۧۘ;)Ll/ۖ֫ۘ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۧۘ;->᩸:Ll/ۖ֫ۘ;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ܽۨۖ;Ljavax/crypto/SecretKey;)Ll/ܽۨۖ;
    .locals 2

    if-eqz p2, :cond_0

    .line 55
    new-instance v0, Ll/ۖۧۘ;

    invoke-direct {v0, p0, p1, p2}, Ll/ۖۧۘ;-><init>(Ll/ۘۧۘ;Ll/ܽۨۖ;Ljavax/crypto/SecretKey;)V

    return-object v0

    .line 57
    :cond_0
    invoke-virtual {p1}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p2

    check-cast p2, Ll/᩻ۨۖ;

    invoke-virtual {p2}, Ll/᩻ۨۖ;->᩻()Ll/᩺ۛۖ;

    move-result-object p2

    sget-object v0, Ll/ۘۧۘ;->᩶:Ll/֫᩻֨;

    const-string v1, "Not wrapping {} as signed, as no key is set."

    invoke-interface {v0, p2, v1}, Ll/֫᩻֨;->ܿ(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
