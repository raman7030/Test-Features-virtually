.class public final Ll/֫֨ۚ;
.super Ljava/lang/Object;
.source "KBJF"


# static fields
.field public static final ܽ:Ll/֫֨ۚ;

.field public static final ᩳ:Ll/֫֨ۚ;


# instance fields
.field public final ֫:Z

.field public final ۧ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 21
    new-instance v0, Ll/֫֨ۚ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Ll/֫֨ۚ;-><init>(ZZ)V

    sput-object v0, Ll/֫֨ۚ;->ܽ:Ll/֫֨ۚ;

    .line 22
    new-instance v0, Ll/֫֨ۚ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v1}, Ll/֫֨ۚ;-><init>(ZZ)V

    sput-object v0, Ll/֫֨ۚ;->ᩳ:Ll/֫֨ۚ;

    return-void
.end method

.method public constructor <init>(ZZ)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-boolean p1, p0, Ll/֫֨ۚ;->ۧ:Z

    .line 49
    iput-boolean p2, p0, Ll/֫֨ۚ;->֫:Z

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 70
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 71
    iget-boolean v0, p0, Ll/֫֨ۚ;->֫:Z

    if-nez v0, :cond_0

    .line 72
    invoke-static {p1}, Ll/᩻֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final ֫(Ll/ܺ֡ۚ;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 77
    iget-boolean v0, p0, Ll/֫֨ۚ;->֫:Z

    if-nez v0, :cond_0

    .line 78
    invoke-virtual {p1}, Ll/ܺ֡ۚ;->normalize()V

    :cond_0
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Ll/֫֨ۚ;->֫:Z

    return v0
.end method

.method public final ۧ(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 60
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 61
    iget-boolean v0, p0, Ll/֫֨ۚ;->ۧ:Z

    if-nez v0, :cond_0

    .line 62
    invoke-static {p1}, Ll/᩻֡ۚ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 32
    iget-boolean v0, p0, Ll/֫֨ۚ;->ۧ:Z

    return v0
.end method
