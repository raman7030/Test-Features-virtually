.class public final Ll/ۡ۬ۘ;
.super Ljava/lang/Object;
.source "491A"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Ll/ۡ۬ۘ;->᩸:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۡ۬ۘ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۡ۬ۘ;->᩸:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 40
    new-instance v0, Ll/ۢ۬ۘ;

    invoke-direct {v0, p0}, Ll/ۢ۬ۘ;-><init>(Ll/ۡ۬ۘ;)V

    return-object v0
.end method
