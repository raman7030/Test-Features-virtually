.class public final synthetic Ll/ܽܺᩳ;
.super Ljava/lang/Object;
.source "K1X4"

# interfaces
.implements Ll/ۢܺᩳ;


# instance fields
.field public final synthetic ֫:Ll/ۜܺᩳ;

.field public final synthetic ۧ:Ljava/lang/String;

.field public final synthetic ܽ:Ljava/lang/String;

.field public final synthetic ܿ:[Ljava/lang/Class;

.field public final synthetic ᩳ:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ۜܺᩳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽܺᩳ;->֫:Ll/ۜܺᩳ;

    iput-object p2, p0, Ll/ܽܺᩳ;->ۧ:Ljava/lang/String;

    iput-object p3, p0, Ll/ܽܺᩳ;->ܽ:Ljava/lang/String;

    iput-object p4, p0, Ll/ܽܺᩳ;->ᩳ:Ljava/lang/String;

    iput-object p5, p0, Ll/ܽܺᩳ;->ܿ:[Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 8

    .line 694
    iget-object v1, p0, Ll/ܽܺᩳ;->֫:Ll/ۜܺᩳ;

    iget-object v6, v1, Ll/ۜܺᩳ;->ܳ:Ll/ܺܺᩳ;

    new-instance v7, Ll/ۨۡᩳ;

    iget-object v2, p0, Ll/ܽܺᩳ;->ۧ:Ljava/lang/String;

    iget-object v3, p0, Ll/ܽܺᩳ;->ܽ:Ljava/lang/String;

    iget-object v4, p0, Ll/ܽܺᩳ;->ᩳ:Ljava/lang/String;

    iget-object v5, p0, Ll/ܽܺᩳ;->ܿ:[Ljava/lang/Class;

    move-object v0, v7

    invoke-direct/range {v0 .. v5}, Ll/ۨۡᩳ;-><init>(Ll/ۜܺᩳ;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;)V

    invoke-static {v6, v7}, Ll/ܺܺᩳ;->֫(Ll/ܺܺᩳ;Ll/ۢܺᩳ;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
