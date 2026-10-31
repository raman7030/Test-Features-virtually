.class public final Ll/ᩴ۫֡;
.super Ljava/lang/Object;
.source "H4NZ"

# interfaces
.implements Ll/ܽܶܺ;


# instance fields
.field public final synthetic ᩸:Ll/֨۫֡;


# direct methods
.method public constructor <init>(Ll/֨۫֡;)V
    .locals 0

    .line 302
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ۫֡;->᩸:Ll/֨۫֡;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 302
    check-cast p1, Ll/ܺ۫֡;

    .line 307
    iget-object v0, p0, Ll/ᩴ۫֡;->᩸:Ll/֨۫֡;

    invoke-static {v0}, Ll/֨۫֡;->֫(Ll/֨۫֡;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 311
    invoke-virtual {p1}, Ll/ܺ۫֡;->ۧ()Ljava/util/Set;

    move-result-object p1

    return-object p1

    .line 308
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This iterator was invalidated by a change to this MutableMethodImplementation."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
