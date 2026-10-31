.class public final synthetic Ll/֫ۡᩳ;
.super Ljava/lang/Object;
.source "M1X3"

# interfaces
.implements Ll/֫ۛ;


# instance fields
.field public final synthetic ֫:Ll/ۧܽۚ;


# direct methods
.method public synthetic constructor <init>(Ll/ۧܽۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֫ۡᩳ;->֫:Ll/ۧܽۚ;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 10

    .line 141
    new-instance v9, Ll/֨ۤ֡;

    .line 142
    iget-object v0, p0, Ll/֫ۡᩳ;->֫:Ll/ۧܽۚ;

    invoke-interface {v0}, Ll/᩺֫ۚ;->ۢ()Ll/֨ۗ֡;

    move-result-object v1

    .line 143
    invoke-interface {v0}, Ll/ۜۧۚ;->᩻()I

    move-result v2

    .line 144
    invoke-interface {v0}, Ll/ۤ֫ۚ;->ᩳ()I

    move-result v3

    .line 145
    invoke-interface {v0}, Ll/ۤ֫ۚ;->ܽ()I

    move-result v4

    .line 146
    invoke-interface {v0}, Ll/ۤ֫ۚ;->ܳ()I

    move-result v5

    .line 147
    invoke-interface {v0}, Ll/ۤ֫ۚ;->ܿ()I

    move-result v6

    .line 148
    invoke-interface {v0}, Ll/ۤ֫ۚ;->ۧ()I

    move-result v7

    .line 149
    invoke-interface {v0}, Ll/ۧۧۚ;->getReference()Ll/۠ܽۚ;

    move-result-object v8

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Ll/֨ۤ֡;-><init>(Ll/֨ۗ֡;IIIIIILl/۠ܽۚ;)V

    return-object v9
.end method
