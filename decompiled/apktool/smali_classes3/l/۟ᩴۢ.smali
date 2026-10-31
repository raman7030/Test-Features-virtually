.class public final Ll/۟ᩴۢ;
.super Ljava/lang/Object;
.source "V7BB"

# interfaces
.implements Ll/ۚܳܳ;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 293
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/۟ᩴۢ;->᩸:I

    iput-object p2, p0, Ll/۟ᩴۢ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getDescription()Ljava/lang/String;
    .locals 2

    .line 296
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Ll/۟ᩴۢ;->᩸:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۟ᩴۢ;->᩹:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 301
    iget v0, p0, Ll/۟ᩴۢ;->᩸:I

    return v0
.end method
