.class public final Ll/ۜ᩷ۖ;
.super Ljava/lang/Object;
.source "M9PM"

# interfaces
.implements Ll/۫ᩴۖ;


# instance fields
.field public final synthetic ֫:Ll/֡ۖۖ;


# direct methods
.method public constructor <init>(Ll/֡ۖۖ;)V
    .locals 0

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ᩷ۖ;->֫:Ll/֡ۖۖ;

    return-void
.end method


# virtual methods
.method public final ֫(I)Z
    .locals 1

    .line 142
    iget-object v0, p0, Ll/ۜ᩷ۖ;->֫:Ll/֡ۖۖ;

    invoke-virtual {v0}, Ll/֡ۖۖ;->ۚ()Ll/ۢۖۖ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۢۖۖ;->֫(I)Ll/ۖۖۖ;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
