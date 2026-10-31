.class public final Ll/᩺᩻᩵;
.super Ljava/lang/Object;
.source "H6Q8"

# interfaces
.implements Ljava/security/PrivilegedAction;


# instance fields
.field public final synthetic ֫:Ll/ܿۜ᩵;


# direct methods
.method public constructor <init>(Ll/ܿۜ᩵;)V
    .locals 0

    .line 659
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺᩻᩵;->֫:Ll/ܿۜ᩵;

    return-void
.end method


# virtual methods
.method public final run()Ljava/lang/Object;
    .locals 3

    .line 661
    new-instance v0, Ll/ۘۜ᩵;

    iget-object v1, p0, Ll/᩺᩻᩵;->֫:Ll/ܿۜ᩵;

    .line 662
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/ۘۜ᩵;-><init>(Ll/ܿۜ᩵;Ljava/lang/ClassLoader;)V

    return-object v0
.end method
