.class public final Ll/ۡ᩻ۘ;
.super Ljava/lang/Object;
.source "IAH0"


# static fields
.field public static final ۧ:Ll/ۡ᩻ۘ;

.field public static final ܽ:Ll/ۡ᩻ۘ;

.field public static final ᩳ:Ll/ۡ᩻ۘ;


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 33
    new-instance v0, Ll/ۡ᩻ۘ;

    const-string v1, "tableDirectory"

    invoke-direct {v0, v1}, Ll/ۡ᩻ۘ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ۡ᩻ۘ;->ᩳ:Ll/ۡ᩻ۘ;

    .line 38
    new-instance v0, Ll/ۡ᩻ۘ;

    const-string v1, "name"

    invoke-direct {v0, v1}, Ll/ۡ᩻ۘ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ۡ᩻ۘ;->ۧ:Ll/ۡ᩻ۘ;

    .line 43
    new-instance v0, Ll/ۡ᩻ۘ;

    const-string v1, "OS/2"

    invoke-direct {v0, v1}, Ll/ۡ᩻ۘ;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ۡ᩻ۘ;->ܽ:Ll/ۡ᩻ۘ;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Ll/ۡ᩻ۘ;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۡ᩻ۘ;
    .locals 1

    .line 59
    new-instance v0, Ll/ۡ᩻ۘ;

    invoke-direct {v0, p0}, Ll/ۡ᩻ۘ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 69
    :cond_0
    instance-of v0, p1, Ll/ۡ᩻ۘ;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    .line 72
    :cond_1
    check-cast p1, Ll/ۡ᩻ۘ;

    .line 73
    iget-object v0, p0, Ll/ۡ᩻ۘ;->֫:Ljava/lang/String;

    .line 91
    iget-object p1, p1, Ll/ۡ᩻ۘ;->֫:Ljava/lang/String;

    .line 73
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 78
    iget-object v0, p0, Ll/ۡ᩻ۘ;->֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Ll/ۡ᩻ۘ;->֫:Ljava/lang/String;

    return-object v0
.end method
