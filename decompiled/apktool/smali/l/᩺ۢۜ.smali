.class public final Ll/᩺ۢۜ;
.super Ljava/lang/Object;
.source "B6ZG"


# instance fields
.field public final ֫:Ll/ۛۢۜ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ll/ۛۢۜ;Ll/ۨۢۜ;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "path"

    .line 25
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string p1, "access"

    .line 26
    invoke-static {p2, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p2, p0, Ll/᩺ۢۜ;->֫:Ll/ۛۢۜ;

    const-string p1, "source"

    .line 27
    invoke-static {p3, p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    return-void
.end method
