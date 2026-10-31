.class public final Ll/۫ܿۚ;
.super Ljava/lang/Object;
.source "Z2S3"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic ᩸:Ll/ۤܿۚ;


# direct methods
.method public constructor <init>(Ll/ۤܿۚ;)V
    .locals 0

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ܿۚ;->᩸:Ll/ۤܿۚ;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 149
    iget-object v0, p0, Ll/۫ܿۚ;->᩸:Ll/ۤܿۚ;

    invoke-virtual {v0}, Ll/ۤܿۚ;->ۧܽ()Ljava/lang/Iterable;

    move-result-object v1

    check-cast v1, Ll/ۘ᩻ۚ;

    invoke-virtual {v1}, Ll/ۘ᩻ۚ;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-virtual {v0}, Ll/ۤܿۚ;->ܿܽ()Ljava/lang/Iterable;

    move-result-object v0

    check-cast v0, Ll/ۘ᩻ۚ;

    invoke-virtual {v0}, Ll/ۘ᩻ۚ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;Ljava/util/Iterator;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
