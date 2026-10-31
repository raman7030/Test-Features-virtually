.class public final Ll/ۧۨۢ;
.super Ljava/lang/RuntimeException;
.source "J6OY"


# instance fields
.field public final ᩸:I

.field public final ᩹:I


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    .line 9
    invoke-direct {p0, p3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 10
    iput p1, p0, Ll/ۧۨۢ;->᩹:I

    .line 11
    iput p2, p0, Ll/ۧۨۢ;->᩸:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 19
    iget v0, p0, Ll/ۧۨۢ;->᩸:I

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 15
    iget v0, p0, Ll/ۧۨۢ;->᩹:I

    return v0
.end method
