.class public final Ll/ۘ᩻ۚ;
.super Ljava/lang/Object;
.source "C2RY"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Iterable;

.field public final synthetic ᩹:Ll/ᩳ᩻ۚ;


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;Ll/ᩳ᩻ۚ;)V
    .locals 0

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘ᩻ۚ;->᩸:Ljava/lang/Iterable;

    iput-object p2, p0, Ll/ۘ᩻ۚ;->᩹:Ll/ᩳ᩻ۚ;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 128
    iget-object v0, p0, Ll/ۘ᩻ۚ;->᩸:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 129
    new-instance v1, Ll/ۖ᩻ۚ;

    invoke-direct {v1, p0, v0}, Ll/ۖ᩻ۚ;-><init>(Ll/ۘ᩻ۚ;Ljava/util/Iterator;)V

    return-object v1
.end method
