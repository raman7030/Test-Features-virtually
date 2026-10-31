.class public final synthetic Ll/ۖ᩺᩷;
.super Ljava/lang/Object;
.source "C19Y"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic ֫:Ljava/lang/String;

.field public final synthetic ۧ:[B


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;[B)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ᩺᩷;->֫:Ljava/lang/String;

    iput-object p2, p0, Ll/ۖ᩺᩷;->ۧ:[B

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۖ᩺᩷;->֫:Ljava/lang/String;

    iget-object v1, p0, Ll/ۖ᩺᩷;->ۧ:[B

    invoke-static {v0, v1}, Ll/᩵᩺᩷;->֫(Ljava/lang/String;[B)[B

    move-result-object v0

    return-object v0
.end method
