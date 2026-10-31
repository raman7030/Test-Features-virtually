.class public final Ll/֫֨ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ܶ۠ᩴ;


# instance fields
.field public final a:Ll/ۙ۠ᩴ;

.field public final b:Ll/ۙ۠ᩴ;

.field public final c:Ll/ۙ۠ᩴ;

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:J

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ll/ۙ۠ᩴ;Ll/ۙ۠ᩴ;Ll/ۙ۠ᩴ;ZZZZJLjava/lang/Object;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p1, p0, Ll/֫֨ᩴ;->a:Ll/ۙ۠ᩴ;

    .line 75
    iput-object p2, p0, Ll/֫֨ᩴ;->b:Ll/ۙ۠ᩴ;

    .line 76
    iput-object p3, p0, Ll/֫֨ᩴ;->c:Ll/ۙ۠ᩴ;

    .line 77
    iput-boolean p4, p0, Ll/֫֨ᩴ;->d:Z

    .line 78
    iput-boolean p5, p0, Ll/֫֨ᩴ;->e:Z

    .line 79
    iput-boolean p6, p0, Ll/֫֨ᩴ;->f:Z

    .line 80
    iput-boolean p7, p0, Ll/֫֨ᩴ;->g:Z

    .line 81
    iput-wide p8, p0, Ll/֫֨ᩴ;->h:J

    .line 82
    iput-object p10, p0, Ll/֫֨ᩴ;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final creationTime()Ll/ۙ۠ᩴ;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/֫֨ᩴ;->c:Ll/ۙ۠ᩴ;

    return-object v0
.end method

.method public final fileKey()Ljava/lang/Object;
    .locals 1

    .line 127
    iget-object v0, p0, Ll/֫֨ᩴ;->i:Ljava/lang/Object;

    return-object v0
.end method

.method public final isDirectory()Z
    .locals 1

    .line 107
    iget-boolean v0, p0, Ll/֫֨ᩴ;->e:Z

    return v0
.end method

.method public final isOther()Z
    .locals 1

    .line 117
    iget-boolean v0, p0, Ll/֫֨ᩴ;->g:Z

    return v0
.end method

.method public final isRegularFile()Z
    .locals 1

    .line 102
    iget-boolean v0, p0, Ll/֫֨ᩴ;->d:Z

    return v0
.end method

.method public final isSymbolicLink()Z
    .locals 1

    .line 112
    iget-boolean v0, p0, Ll/֫֨ᩴ;->f:Z

    return v0
.end method

.method public final lastAccessTime()Ll/ۙ۠ᩴ;
    .locals 1

    .line 92
    iget-object v0, p0, Ll/֫֨ᩴ;->b:Ll/ۙ۠ᩴ;

    return-object v0
.end method

.method public final lastModifiedTime()Ll/ۙ۠ᩴ;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/֫֨ᩴ;->a:Ll/ۙ۠ᩴ;

    return-object v0
.end method

.method public final size()J
    .locals 2

    .line 122
    iget-wide v0, p0, Ll/֫֨ᩴ;->h:J

    return-wide v0
.end method
