.class public final Ll/ᩳۙۜ;
.super Ljava/lang/IllegalArgumentException;
.source "96ZB"


# instance fields
.field public final ᩸:I

.field public final ᩹:Ll/ܿۙۜ;


# direct methods
.method public constructor <init>(ILl/ܿۙۜ;)V
    .locals 2

    .line 136
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid HTTP request headers at line "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 137
    iput p1, p0, Ll/ᩳۙۜ;->᩸:I

    .line 138
    iput-object p2, p0, Ll/ᩳۙۜ;->᩹:Ll/ܿۙۜ;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 142
    iget v0, p0, Ll/ᩳۙۜ;->᩸:I

    return v0
.end method

.method public final ۧ()Ll/ܿۙۜ;
    .locals 1

    .line 146
    iget-object v0, p0, Ll/ᩳۙۜ;->᩹:Ll/ܿۙۜ;

    return-object v0
.end method
