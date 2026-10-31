.class public final Ll/ᩴ᩵֫;
.super Ljava/lang/Object;
.source "98OO"


# instance fields
.field public final ֫:Ll/ۚᩴ֫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 692
    new-instance v0, Ll/ۘ᩵֫;

    invoke-direct {v0}, Ll/ۘ᩵֫;-><init>()V

    invoke-virtual {v0}, Ll/ۘ᩵֫;->֫()Ll/ᩴ᩵֫;

    const/4 v0, 0x0

    .line 749
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>(Ll/ۚᩴ֫;)V
    .locals 0

    .line 696
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 697
    iput-object p1, p0, Ll/ᩴ᩵֫;->֫:Ll/ۚᩴ֫;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴ᩵֫;)Ll/ۚᩴ֫;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ᩵֫;->֫:Ll/ۚᩴ֫;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    .line 737
    :cond_0
    instance-of v0, p1, Ll/ᩴ᩵֫;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 740
    :cond_1
    check-cast p1, Ll/ᩴ᩵֫;

    .line 741
    iget-object v0, p0, Ll/ᩴ᩵֫;->֫:Ll/ۚᩴ֫;

    iget-object p1, p1, Ll/ᩴ᩵֫;->֫:Ll/ۚᩴ֫;

    invoke-virtual {v0, p1}, Ll/ۚᩴ֫;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 746
    iget-object v0, p0, Ll/ᩴ᩵֫;->֫:Ll/ۚᩴ֫;

    invoke-virtual {v0}, Ll/ۚᩴ֫;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ֫(I)Z
    .locals 1

    .line 708
    iget-object v0, p0, Ll/ᩴ᩵֫;->֫:Ll/ۚᩴ֫;

    invoke-virtual {v0, p1}, Ll/ۚᩴ֫;->֫(I)Z

    move-result p1

    return p1
.end method
