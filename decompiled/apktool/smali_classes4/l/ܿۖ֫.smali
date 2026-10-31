.class public abstract Ll/ܿۖ֫;
.super Ljava/lang/Object;
.source "U6B4"


# direct methods
.method public static ֫(Ll/᩻ۡ֫;)Ll/ܿۖ֫;
    .locals 2

    .line 128
    new-instance v0, Ll/᩷ۖ֫;

    move-object v1, p0

    check-cast v1, Ll/۬ܺ֫;

    invoke-interface {v1}, Ll/۬ܺ֫;->getViewModelStore()Ll/ۗܺ֫;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/᩷ۖ֫;-><init>(Ll/᩻ۡ֫;Ll/ۗܺ֫;)V

    return-object v0
.end method


# virtual methods
.method public abstract ֫()V
.end method

.method public abstract ֫(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method
