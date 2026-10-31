.class public final Ll/ܳ֨᩵;
.super Ljava/lang/Object;
.source "E9ZA"

# interfaces
.implements Ljava/security/PrivilegedExceptionAction;


# instance fields
.field public final synthetic ֫:Ll/᩻֨᩵;

.field public final synthetic ۧ:Z

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ᩳ:Ll/ۗ᩵᩵;


# direct methods
.method public constructor <init>(Ll/᩻֨᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۗ᩵᩵;Z)V
    .locals 0

    .line 689
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ֨᩵;->֫:Ll/᩻֨᩵;

    iput-object p3, p0, Ll/ܳ֨᩵;->ܽ:Ljava/lang/String;

    iput-object p4, p0, Ll/ܳ֨᩵;->ᩳ:Ll/ۗ᩵᩵;

    iput-boolean p5, p0, Ll/ܳ֨᩵;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final run()Ljava/lang/Object;
    .locals 5

    .line 693
    iget-object v0, p0, Ll/ܳ֨᩵;->֫:Ll/᩻֨᩵;

    invoke-virtual {v0}, Ll/᩻֨᩵;->ᩳ()Ll/ۛ֡᩵;

    move-result-object v1

    invoke-virtual {v0}, Ll/᩻֨᩵;->getContext()Ll/ᩴۡ᩵;

    move-result-object v0

    iget-object v2, p0, Ll/ܳ֨᩵;->ᩳ:Ll/ۗ᩵᩵;

    invoke-virtual {v2}, Ll/ۗ᩵᩵;->֨֫()[B

    move-result-object v2

    iget-boolean v3, p0, Ll/ܳ֨᩵;->ۧ:Z

    iget-object v4, p0, Ll/ܳ֨᩵;->ܽ:Ljava/lang/String;

    invoke-interface {v1, v0, v4, v2, v3}, Ll/ۛ֡᩵;->֫(Ll/ᩴۡ᩵;Ljava/lang/String;[BZ)Ll/ܶۚ᩵;

    move-result-object v0

    return-object v0
.end method
