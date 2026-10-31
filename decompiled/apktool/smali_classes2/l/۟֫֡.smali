.class public final Ll/۟֫֡;
.super Ljava/lang/Object;
.source "G4EY"


# static fields
.field public static final ۜ:Ll/ۨܽ֡;

.field public static final ܳ:Ll/ۨܽ֡;

.field public static final ܿ:Ll/ۨܽ֡;

.field public static final ᩳ:Ll/ۨܽ֡;

.field public static final ᩷:Ll/ۨܽ֡;

.field public static final ᩻:Ll/ۨܽ֡;


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/ۨܽ֡;

.field public final ܽ:Ll/ۨܽ֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, ":"

    .line 25
    invoke-static {v0}, Ll/ۨܽ֡;->ܿ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object v0

    sput-object v0, Ll/۟֫֡;->ᩳ:Ll/ۨܽ֡;

    const-string v0, ":status"

    .line 33
    invoke-static {v0}, Ll/ۨܽ֡;->ܿ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object v0

    sput-object v0, Ll/۟֫֡;->ܿ:Ll/ۨܽ֡;

    const-string v0, ":method"

    .line 34
    invoke-static {v0}, Ll/ۨܽ֡;->ܿ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object v0

    sput-object v0, Ll/۟֫֡;->᩻:Ll/ۨܽ֡;

    const-string v0, ":path"

    .line 35
    invoke-static {v0}, Ll/ۨܽ֡;->ܿ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object v0

    sput-object v0, Ll/۟֫֡;->ۜ:Ll/ۨܽ֡;

    const-string v0, ":scheme"

    .line 36
    invoke-static {v0}, Ll/ۨܽ֡;->ܿ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object v0

    sput-object v0, Ll/۟֫֡;->᩷:Ll/ۨܽ֡;

    const-string v0, ":authority"

    .line 37
    invoke-static {v0}, Ll/ۨܽ֡;->ܿ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object v0

    sput-object v0, Ll/۟֫֡;->ܳ:Ll/ۨܽ֡;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 48
    invoke-static {p1}, Ll/ۨܽ֡;->ܿ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object p1

    invoke-static {p2}, Ll/ۨܽ֡;->ܿ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ll/۟֫֡;-><init>(Ll/ۨܽ֡;Ll/ۨܽ֡;)V

    return-void
.end method

.method public constructor <init>(Ll/ۨܽ֡;Ljava/lang/String;)V
    .locals 0

    .line 52
    invoke-static {p2}, Ll/ۨܽ֡;->ܿ(Ljava/lang/String;)Ll/ۨܽ֡;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Ll/۟֫֡;-><init>(Ll/ۨܽ֡;Ll/ۨܽ֡;)V

    return-void
.end method

.method public constructor <init>(Ll/ۨܽ֡;Ll/ۨܽ֡;)V
    .locals 0

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, Ll/۟֫֡;->ۧ:Ll/ۨܽ֡;

    .line 57
    iput-object p2, p0, Ll/۟֫֡;->ܽ:Ll/ۨܽ֡;

    .line 58
    invoke-virtual {p1}, Ll/ۨܽ֡;->᩷()I

    move-result p1

    add-int/lit8 p1, p1, 0x20

    invoke-virtual {p2}, Ll/ۨܽ֡;->᩷()I

    move-result p2

    add-int/2addr p2, p1

    iput p2, p0, Ll/۟֫֡;->֫:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 62
    instance-of v0, p1, Ll/۟֫֡;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 63
    check-cast p1, Ll/۟֫֡;

    .line 64
    iget-object v0, p0, Ll/۟֫֡;->ۧ:Ll/ۨܽ֡;

    iget-object v2, p1, Ll/۟֫֡;->ۧ:Ll/ۨܽ֡;

    invoke-virtual {v0, v2}, Ll/ۨܽ֡;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۟֫֡;->ܽ:Ll/ۨܽ֡;

    iget-object p1, p1, Ll/۟֫֡;->ܽ:Ll/ۨܽ֡;

    .line 65
    invoke-virtual {v0, p1}, Ll/ۨܽ֡;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 72
    iget-object v0, p0, Ll/۟֫֡;->ۧ:Ll/ۨܽ֡;

    invoke-virtual {v0}, Ll/ۨܽ֡;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 73
    iget-object v1, p0, Ll/۟֫֡;->ܽ:Ll/ۨܽ֡;

    invoke-virtual {v1}, Ll/ۨܽ֡;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 78
    iget-object v0, p0, Ll/۟֫֡;->ۧ:Ll/ۨܽ֡;

    invoke-virtual {v0}, Ll/ۨܽ֡;->ᩴ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/۟֫֡;->ܽ:Ll/ۨܽ֡;

    invoke-virtual {v1}, Ll/ۨܽ֡;->ᩴ()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ll/᩶۟᩵;->֫:[B

    .line 472
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, ": "

    .line 0
    invoke-static {v0, v2, v1}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
