.class public final Ll/ܿۘۜ;
.super Ljava/lang/Object;
.source "46YI"


# instance fields
.field public final ֫:[B

.field public final ۧ:I

.field public final ܽ:Ljava/nio/charset/Charset;

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/nio/charset/Charset;Ljava/lang/String;I[B)V
    .locals 0

    .line 185
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 186
    iput-object p1, p0, Ll/ܿۘۜ;->ܽ:Ljava/nio/charset/Charset;

    .line 187
    iput-object p2, p0, Ll/ܿۘۜ;->ᩳ:Ljava/lang/String;

    .line 188
    iput p3, p0, Ll/ܿۘۜ;->ۧ:I

    .line 189
    iput-object p4, p0, Ll/ܿۘۜ;->֫:[B

    return-void
.end method


# virtual methods
.method public final ֫([B)Z
    .locals 1

    .line 199
    invoke-static {p1}, Ll/ܳۘۜ;->֫([B)Ll/ᩳۘۜ;

    move-result-object p1

    .line 200
    iget-object v0, p0, Ll/ܿۘۜ;->ᩳ:Ljava/lang/String;

    invoke-static {v0}, Ll/ܳۘۜ;->֫(Ljava/lang/String;)Ll/ᩳۘۜ;

    move-result-object v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫()[B
    .locals 1

    .line 194
    iget-object v0, p0, Ll/ܿۘۜ;->֫:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    :cond_0
    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method
