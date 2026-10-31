.class public abstract Ll/ܺᩳܽ;
.super Ljava/lang/Object;
.source "Y4OL"

# interfaces
.implements Ll/ۡ᩻ܽ;


# instance fields
.field public ᩸:I

.field public ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput p1, p0, Ll/ܺᩳܽ;->᩸:I

    .line 14
    iput-object p2, p0, Ll/ܺᩳܽ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getPackageName()Ljava/lang/String;
    .locals 1

    .line 24
    iget-object v0, p0, Ll/ܺᩳܽ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ll/۠᩻ܽ;)V
    .locals 2

    .line 29
    check-cast p1, Ll/ۡ᩻ܽ;

    .line 19
    iget v0, p0, Ll/ܺᩳܽ;->᩸:I

    .line 30
    invoke-interface {p1}, Ll/ۡ᩻ܽ;->᩻()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 24
    iget-object v0, p0, Ll/ܺᩳܽ;->᩹:Ljava/lang/String;

    .line 32
    invoke-interface {p1}, Ll/ۡ᩻ܽ;->getPackageName()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 31
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final ᩻()I
    .locals 1

    .line 19
    iget v0, p0, Ll/ܺᩳܽ;->᩸:I

    return v0
.end method
