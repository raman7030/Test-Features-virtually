.class public final Ll/ۤܶ᩻;
.super Ljava/lang/Object;
.source "R8F6"

# interfaces
.implements Ll/ۧܺۡ;


# instance fields
.field public final synthetic ֫:Ll/֨᩷֡;

.field public final synthetic ۧ:Ll/ۤ᩷֡;


# direct methods
.method public constructor <init>(Ll/ۤ᩷֡;Ll/֨᩷֡;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۤܶ᩻;->ۧ:Ll/ۤ᩷֡;

    iput-object p2, p0, Ll/ۤܶ᩻;->֫:Ll/֨᩷֡;

    return-void
.end method


# virtual methods
.method public final getInputStream()Ljava/io/InputStream;
    .locals 2

    .line 64
    iget-object v0, p0, Ll/ۤܶ᩻;->ۧ:Ll/ۤ᩷֡;

    iget-object v1, p0, Ll/ۤܶ᩻;->֫:Ll/֨᩷֡;

    invoke-virtual {v0, v1}, Ll/ۤ᩷֡;->֫(Ll/֨᩷֡;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method public final length()J
    .locals 2

    .line 69
    iget-object v0, p0, Ll/ۤܶ᩻;->֫:Ll/֨᩷֡;

    invoke-virtual {v0}, Ll/֨᩷֡;->᩵()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic ֫()Ljava/io/InputStream;
    .locals 1

    .line 0
    invoke-static {p0}, Ll/֫ܺۡ;->֫(Ll/ۧܺۡ;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
