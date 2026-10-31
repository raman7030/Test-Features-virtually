.class public final Ll/ۘ᩸᩵;
.super Ljava/lang/Object;
.source "CANR"

# interfaces
.implements Ll/ۨܶ᩵;


# static fields
.field public static final ᩸:Ll/ۘ᩸᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2
    new-instance v0, Ll/ۘ᩸᩵;

    .line 125
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 0
    sput-object v0, Ll/ۘ᩸᩵;->᩸:Ll/ۘ᩸᩵;

    return-void
.end method


# virtual methods
.method public final getContext()Ll/ܳ᩸᩵;
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This continuation is already complete"

    .line 127
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "This continuation is already complete"

    return-object v0
.end method

.method public final ֫(Ljava/lang/Object;)V
    .locals 1

    .line 2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This continuation is already complete"

    .line 130
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
