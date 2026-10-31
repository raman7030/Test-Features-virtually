.class public final Ll/ܿ֨᩵;
.super Ljava/lang/Object;
.source "E9ZA"

# interfaces
.implements Ljava/security/PrivilegedExceptionAction;


# instance fields
.field public final synthetic ֫:Ll/ܶۚ᩵;

.field public final synthetic ۧ:[B


# direct methods
.method public constructor <init>(Ll/ܶۚ᩵;[B)V
    .locals 0

    .line 637
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ֨᩵;->֫:Ll/ܶۚ᩵;

    iput-object p2, p0, Ll/ܿ֨᩵;->ۧ:[B

    return-void
.end method


# virtual methods
.method public final run()Ljava/lang/Object;
    .locals 3

    .line 641
    iget-object v0, p0, Ll/ܿ֨᩵;->ۧ:[B

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    array-length v1, v0

    :goto_0
    iget-object v2, p0, Ll/ܿ֨᩵;->֫:Ll/ܶۚ᩵;

    invoke-interface {v2, v1, v0}, Ll/ܶۚ᩵;->֫(I[B)[B

    move-result-object v0

    return-object v0
.end method
