.class public Ll/ۢۛۖ;
.super Ljava/lang/Object;
.source "H9EI"

# interfaces
.implements Ll/ۡۛۖ;


# instance fields
.field public final ᩸:Ljava/lang/String;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    iput v0, p0, Ll/ۢۛۖ;->᩹:I

    .line 29
    iput-object p1, p0, Ll/ۢۛۖ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Ll/ۢۛۖ;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 41
    iget v0, p0, Ll/ۢۛۖ;->᩹:I

    return v0
.end method
