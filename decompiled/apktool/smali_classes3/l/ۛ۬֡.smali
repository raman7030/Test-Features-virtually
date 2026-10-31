.class public abstract Ll/ۛ۬֡;
.super Ll/ᩳ۫֡;
.source "866T"

# interfaces
.implements Ll/۠֫ۚ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 38
    invoke-direct {p0}, Ll/ᩳ۫֡;-><init>()V

    return-void
.end method


# virtual methods
.method public final ᩳ()I
    .locals 2

    .line 43
    iget-object v0, p0, Ll/ᩳ۫֡;->᩸:Ll/ܺ۫֡;

    if-eqz v0, :cond_0

    .line 80
    iget v0, v0, Ll/ܺ۫֡;->֫:I

    return v0

    .line 44
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot get the address of a BuilderDebugItem that isn\'t associated with a method."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
